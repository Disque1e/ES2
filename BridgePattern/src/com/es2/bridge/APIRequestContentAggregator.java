package com.es2.bridge;

public class APIRequestContentAggregator extends APIRequest {
    public APIRequestContentAggregator (){}
    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException{
        APIServiceInterface content = services.get(serviceId);

        if(content == null){
            throw new ServiceNotFoundException();
        }

        return content.getContent(contentId);
    }
}
