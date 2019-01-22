package me.vrnsky.patterns.Builder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    private Map<String, String> params = new HashMap<>();
    private String content;
    private String contentType;
    private String status;
    private String method;
    private String userAgent;
    private String host;
    private String port;

    public void addParam(String paramName, String paramValue) {
        this.params.put(paramName, paramValue);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
