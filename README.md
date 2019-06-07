# spring-liquibase

> The purpose of this project is to get acquainted with the liquibase in detail and to process some of its basic features


### Liquibase Changelog

If we are starting with already existing database, with liquibase maven plugin we can create the current database schema
using following command:

`mvn liquibase:generateChangeLog` 

This will generate changelog from current database and write it in console, if we want to have it in seperate file we can
specify in `liquibase.properties` file, directory and file in witch we want to have changelog generated.
 
>(e.g. ) `#outputChangeLogFile=src/main/resources/db/changelog/changeLog.xml`

Or if you are command line fan you can do it like this:

> `mvn liquibase:generateChangeLog -Dliquibase.outputChangeLogFile=src/main/resources/db/changelog/changeLog.xml`

### Liquibase Help

Liquibase gives as really nice feature to help as with all necessary information about specific goal 

> `mvn liquibase:help -Ddetail=true -Dgoal=<goal-name>`