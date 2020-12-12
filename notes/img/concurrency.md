# Concurrency


### Avoid multiple thread simultanoeous data access
```java
synchronized(sync_object) {
   // Access shared variables and other
   // shared resources
}
```