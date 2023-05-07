package com.example.foodDelivery.Model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;




@RedisHash("employe")
public class EmployeModel implements Serializable {
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -4620714624416328115L;

		@Id
	    private String ip;
		
		private String name;
		
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}


}
