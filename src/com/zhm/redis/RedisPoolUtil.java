package com.zhm.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPoolUtil {
	private volatile JedisPool jedisPool=null;
	
	public RedisPoolUtil(){
		
	}
	public JedisPool getNewInstance1(){
		if(jedisPool!=null){
			synchronized (RedisPoolUtil.class) {
				if(jedisPool!=null){
					JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
					//jedisPoolConfig.
					  //jedisPoolConfig.setMaxTotal(150); 
					//jedisPool=new JedisPool(jedisPoolConfig,"192.168.6.140");
				}
			}
		}
		return jedisPool;
	}
	public Jedis getNewInstance(){
		//JedisPoolConfig jconfig=new JedisPoolConfig();
		JedisPoolConfig config = new JedisPoolConfig();
		if(jedisPool==null){
			
		}
		return null;
	}
}
