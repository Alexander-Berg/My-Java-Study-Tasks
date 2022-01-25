# Exeptions2
 OOP5
 application Stactrace.jar failed to launch and throwing exeptions
 
        java.lang.IllegalStateException: Failed to execute CommandLineRunner
        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:787) ~[spring-boot-2.2.5.RELEASE.jar!/:2.2.5.RELEASE]
        at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:768) ~[spring-boot-2.2.5.RELEASE.jar!/:2.2.5.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:322) ~[spring-boot-2.2.5.RELEASE.jar!/:2.2.5.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) ~[spring-boot-2.2.5.RELEASE.jar!/:2.2.5.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1215) ~[spring-boot-2.2.5.RELEASE.jar!/:2.2.5.RELEASE]
        at ru.netology.stacktrace.StacktraceApplication.main(StacktraceApplication.java:13) ~[classes!/:0.0.1-SNAPSHOT]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
        at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) ~[stacktrace.jar:0.0.1-SNAPSHOT]
        at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) ~[stacktrace.jar:0.0.1-SNAPSHOT]
        at org.springframework.boot.loader.Launcher.launch(Launcher.java:51) ~[stacktrace.jar:0.0.1-SNAPSHOT]
        at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:52) ~[stacktrace.jar:0.0.1-SNAPSHOT]
        Caused by: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection; nested exception is                    
        com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure``

        The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
        at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:82) ~[spring-jdbc-5.2.4.RELEASE.jar!/:5.2.4.RELEASE]
        at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:371) ~[spring-jdbc-5.2.4.RELEASE.jar!/:5.2.4.RELEASE]
        at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:418) ~[spring-jdbc-5.2.4.RELEASE.jar!/:5.2.4.RELEASE]
        at ru.netology.stacktrace.StacktraceApplication.lambda$runner$0(StacktraceApplication.java:19) ~[classes!/:0.0.1-SNAPSHOT]
        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:784) ~[spring-boot-2.2.5.RELEASE.jar!/:2.2.5.RELEASE]
        ... 13 common frames omitted
        Caused by: com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure

        The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
        at com.mysql.cj.jdbc.exceptions.SQLError.createCommunicationsException(SQLError.java:174) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:64) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:836) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:456) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:246) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:197) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-3.4.2.jar!/:na]
        at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:354) ~[HikariCP-3.4.2.jar!/:na]
        at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:202) ~[HikariCP-3.4.2.jar!/:na]
        at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:473) ~[HikariCP-3.4.2.jar!/:na]
        at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:554) ~[HikariCP-3.4.2.jar!/:na]
        at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:115) ~[HikariCP-3.4.2.jar!/:na]
        at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-3.4.2.jar!/:na]
        at org.springframework.jdbc.datasource.DataSourceUtils.fetchConnection(DataSourceUtils.java:158) ~[spring-jdbc-5.2.4.RELEASE.jar!/:5.2.4.RELEASE]
        at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:116) ~[spring-jdbc-5.2.4.RELEASE.jar!/:5.2.4.RELEASE]
        at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:79) ~[spring-jdbc-5.2.4.RELEASE.jar!/:5.2.4.RELEASE]
        ... 17 common frames omitted
        Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure

        The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method) ~[na:na]
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62) ~[na:na]
        at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45) ~[na:na]
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490) ~[na:na]
        at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:61) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:105) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.exceptions.ExceptionFactory.createException(ExceptionFactory.java:151) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.exceptions.ExceptionFactory.createCommunicationsException(ExceptionFactory.java:167) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:91) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.NativeSession.connect(NativeSession.java:144) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.jdbc.ConnectionImpl.connectOneTryOnly(ConnectionImpl.java:956) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:826) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        ... 30 common frames omitted
        Caused by: java.net.ConnectException: Connection refused: connect
        at java.base/java.net.PlainSocketImpl.waitForConnect(Native Method) ~[na:na]
        at java.base/java.net.PlainSocketImpl.socketConnect(PlainSocketImpl.java:107) ~[na:na]
        at java.base/java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:399) ~[na:na]
        at java.base/java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:242) ~[na:na]
        at java.base/java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:224) ~[na:na]
        at java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:na]
        at java.base/java.net.Socket.connect(Socket.java:609) ~[na:na]
        at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:155) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:65) ~[mysql-connector-java-8.0.19.jar!/:8.0.19]
        ... 33 common frames omitted
