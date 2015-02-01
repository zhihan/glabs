package me.zhihan.glabs

import org.apache.http.HttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.methods.CloseableHttpResponse;

class ClientMain {
	static void main(String[] args) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://httpd.apache.org");
		CloseableHttpResponse response1 = httpclient.execute(httpGet);
		try {
			println(response1.getStatusLine());
			println(response1);
			HttpEntity entity1 = response1.getEntity();
    		EntityUtils.consume(entity1);
   		} finally {
    		response1.close();
    	}
	}
}