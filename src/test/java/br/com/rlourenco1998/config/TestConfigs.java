package br.com.rlourenco1998.config;

public interface TestConfigs {
    int SERVER_PORT = 8888;

    String HEADER_PARAM_AUTHORIZATION = "Authorization";
    String HEADER_PARAM_ORIGIN = "Origin";

    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CONTENT_TYPE_XML = "application/xml";
    public static final String CONTENT_TYPE_YML = "application/x-yaml";

    //String ORIGIN_TESTE = "https://www.teste.com.br";
    String ORIGIN_WRONG = "https://www.wrong.com.br";
    String ORIGIN_LOCAL = "http://localhost:8080";
}