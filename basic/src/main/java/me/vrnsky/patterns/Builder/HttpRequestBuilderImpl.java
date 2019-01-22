package me.vrnsky.patterns.Builder;

public class HttpRequestBuilderImpl implements HttpRequestBuilder {

    private HttpRequest httpRequest;
    @Override
    public void reset() {
        this.httpRequest = new HttpRequest();
    }

    @Override
    public HttpRequestBuilder withParam(String param, String value) {
        this.httpRequest.addParam(param, value);
        return this;
    }

    @Override
    public HttpRequestBuilder withContent(String content) {
        this.httpRequest.setContent(content);
        return this;
    }

    @Override
    public HttpRequestBuilder withContentType(String contentType) {
        this.httpRequest.setContentType(contentType);
        return this;
    }

    @Override
    public HttpRequestBuilder withStatus(String status) {
        this.httpRequest.setStatus(status);
        return this;
    }

    @Override
    public HttpRequestBuilder withMethod(String method) {
        this.httpRequest.setMethod(method);
        return this;
    }

    @Override
    public HttpRequestBuilder withUserAgent(String userAgent) {
        this.httpRequest.setUserAgent(userAgent);
        return this;
    }

    @Override
    public HttpRequestBuilder withHost(String host) {
        this.httpRequest.setHost(host);
        return this;
    }

    @Override
    public HttpRequestBuilder withPort(String port) {
        this.httpRequest.setPort(port);
        return this;
    }

    public HttpRequest build() {
        return this.httpRequest;
    }
}
