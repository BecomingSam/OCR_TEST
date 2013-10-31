package com.food.ocr;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;

public class OCRApiService implements OCRService {

	@Override
	public String convertToText(String language, String filePath) {
		StringBuilder responseText = new StringBuilder();
		try {
			int responseCode = sendImage(language, filePath, responseText);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return responseText.toString();
	}
	
    public final String SERVICE_URL = "http://api.ocrapiservice.com/1.0/rest/ocr";
    
    private final String PARAM_IMAGE = "image";
    private final String PARAM_LANGUAGE = "language";
    private final String PARAM_APIKEY = "apikey";
    
    private String apiKey = "FGyufuGkmw";
    

    private int sendImage(final String language, final String filePath, StringBuilder sb) throws ClientProtocolException, IOException {
            final HttpClient httpclient = new DefaultHttpClient();
            final HttpPost httppost = new HttpPost(SERVICE_URL);

            final FileBody image = new FileBody(new File(filePath));

            final MultipartEntity reqEntity = new MultipartEntity();
            reqEntity.addPart(PARAM_IMAGE, image);
            reqEntity.addPart(PARAM_LANGUAGE, new StringBody(language));
            reqEntity.addPart(PARAM_APIKEY, new StringBody(getApiKey()));
            httppost.setEntity(reqEntity);

            final HttpResponse response = httpclient.execute(httppost);
            final HttpEntity resEntity = response.getEntity();
            if (resEntity != null) {
             final InputStream stream = resEntity.getContent();
             byte bytes[] = new byte[4096];
             int numBytes;
             while ((numBytes=stream.read(bytes))!=-1) {
                     if (numBytes!=0) {
                             sb.append(new String(bytes, 0, numBytes));
                     }
             }
            }
            
            return response.getStatusLine().getStatusCode();
    }

    public String getApiKey() {
            return apiKey;
    }

    public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
    }

}



