// Generated 28-Mar-2019 using Moditect maven plugin
module com.fasterxml.jackson.jaxrs.base {
    requires com.fasterxml.jackson.annotation;

    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    //Allow multiple implementations of ws.rs
	requires static javax.ws.rs.api;
	requires static java.ws.rs;
	requires static jakarta.ws.rs.api;

    exports com.fasterxml.jackson.jaxrs.annotation;
    exports com.fasterxml.jackson.jaxrs.base;
    exports com.fasterxml.jackson.jaxrs.base.nocontent;
    exports com.fasterxml.jackson.jaxrs.cfg;
    exports com.fasterxml.jackson.jaxrs.util;
}
