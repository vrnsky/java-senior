package me.vrnsky.patterns.Builder;

public interface HttpRequestBuilder {
    void reset();

    HttpRequestBuilder withParam(String param, String value);

    HttpRequestBuilder withContent(String content);

    HttpRequestBuilder withContentType(String contentType);

    HttpRequestBuilder withStatus(String status);

    HttpRequestBuilder withMethod(String method);

    HttpRequestBuilder withUserAgent(String userAgent);

    HttpRequestBuilder withHost(String host);

    HttpRequestBuilder withPort(String port);
}
