FROM payara/server-full:6.2023.4-jdk17
COPY postgresql-42.5.4.jar /opt/payara/appserver/glassfish/lib/postgresql-42.5.4.jar
COPY src/main/resources/META-INF/persistence.xml $DEPLOY_DIR/META-INF/

RUN echo "create-jdbc-connection-pool --datasourceclassname org.postgresql.ds.PGSimpleDataSource --restype javax.sql.DataSource --property serverName=db:user=postgres:password=1234:databaseName=delivery:port=5432:driverClass=org.postgresql.Driver pool/delivery" >> /opt/payara/config/post-boot-commands-final.asadmin
RUN echo "create-jdbc-resource --connectionpoolid pool/delivery jdbc/delivery" >> /opt/payara/config/post-boot-commands-final.asadmin