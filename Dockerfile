FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER nestor.morocco@gmail.com
COPY target/saludo-server-0.0.1-SNAPSHOT.jar /opt/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/saludo-server-0.0.1-SNAPSHOT.jar"]
EXPOSE 8000

