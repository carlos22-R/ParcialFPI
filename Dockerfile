FROM payara/server-full:6.2023.4-jdk17
#COPY postgresql-42.5.4.jar /opt/payara/appserver/glassfish/lib/postgresql-42.5.4.jar
#RUN echo "create-jdbc-connection-pool --datasourceclassname org.postgresql.ds.PGSimpleDataSource --restype javax.sql.DataSource --property serverName=db:user=postgres:password=1234:databaseName=delivery:port=5432:driverClass=org.postgresql.Driver pool/delivery" >> /opt/payara/config/post-boot-commands-final.asadmin
#RUN echo "create-jdbc-resource --connectionpoolid pool/delivery jdbc/delivery" >> /opt/payara/config/post-boot-commands-final.asadmin

USER root
RUN apt-get update && apt-get install -y curl
RUN curl -o /opt/payara/appserver/glassfish/lib/postgresql-42.5.4.jar https://jdbc.postgresql.org/download/postgresql-42.5.4.jar

ENV DB_HOST=db \
    DB_PORT=5432 \
    DB_NAME=delivery \
    DB_USER=postgres \
    DB_PASSWORD=1234

RUN echo "create-jdbc-connection-pool --datasourceclassname org.postgresql.ds.PGSimpleDataSource --restype javax.sql.DataSource --property serverName=${DB_HOST}:user=${DB_USER}:password=${DB_PASSWORD}:databaseName=${DB_NAME}:port=${DB_PORT}:driverClass=org.postgresql.Driver pool/delivery" >> /opt/payara/config/post-boot-commands-final.asadmin
RUN echo "create-jdbc-resource --connectionpoolid pool/delivery jdbc/delivery" >> /opt/payara/config/post-boot-commands-final.asadmin