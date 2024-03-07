package com.es2.bridge;

import java.util.Map;

public class APIMoodle extends Object implements APIServiceInterface{
    int count = 0;
    protected Map<String, String> content;

    public APIMoodle(){}

    public String getContent(String contentId){
        if(!contentId.equals("0"))
        {
            return this.content.get(contentId);
        }
        String res = "";
        for(Map.Entry<String,String> entry : this.content.entrySet())
        {
            res = res.concat(entry.getValue());
        }
        return res;
    }

    public String setContent(String content)
    {
        // Generate a unique ID for the new content
        String contentId = String.valueOf(this.content.size() + 1);
        // Store the content with its generated ID
        this.content.put(contentId, content);
        // Return the ID of the stored content
        return contentId;
    }
}
