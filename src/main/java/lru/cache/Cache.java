package lru.cache;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {

	Map<Object, Object> mapper = Collections.synchronizedMap(new ConcurrentHashMap<Object, Object>());

	public void put(Object key, Object value) {
		mapper.put(key, value);
		
	}

}
