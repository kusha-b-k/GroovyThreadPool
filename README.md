# GroovyThreadPool

#How to create Thread pool in Groovy ?

Here is the simple way to define Thread pool in groovy scripting language,

here i used the below apis to achive the thread pool 

import java.util.concurrent.Callable

import java.util.concurrent.Executors

just call the Executors class, newFixedThreadPool static method and pass the thread number

Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue. At any point, at most nThreads threads will be active processing tasks. If additional tasks are submitted when all threads are active, they will wait in the queue until a thread is available. If any thread terminates due to a failure during execution prior to shutdown, a new one will take its place if needed to execute subsequent tasks. The threads in the pool will exist until it is explicitly shutdown.
