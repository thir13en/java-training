# Performance

### Churn Rate and High Transactional Memory Usage
The `churn rate` describes the number of allocations of temporary objects per transaction or time slice. `Java` allows us to allocate a large number of `objects` very quickly, but **high concurrency and high throughput quickly lead to churn rates beyond what the JVM can sustain**. The transactional memory usage on the other hand describes how much memory a transaction keeps alive until it is finished.