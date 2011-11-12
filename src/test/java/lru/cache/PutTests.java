package lru.cache;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PutTests {

	@Test
	public void shouldPutInCache() {
		Cache cache = new Cache();
		cache.put("key", "value");
		assertThat(cache.mapper.size(), equalTo(1));
		assertThat(cache.mapper.get("key").toString(), equalTo("value"));
	}

}
