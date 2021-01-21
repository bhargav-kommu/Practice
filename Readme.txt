Bank Name: AXIS Bank
Bank Account No.: 916010008599226
IFSC : UTIB0001788

How to create our own hashmap class
Equals and hashcode
Singleton cusomized singleton
How to make a custom class immutable
What is springboot
What we are actually do in developing micro service
Ureka servicerest api
Pagination spring,hibernate
Inversion of control
Autowired
Annotations in spring/spring boot
Explain current role / agile
What are oops concepts
what are solid principles
How gc works and algorithm i know
list java 8 features
What is double locking in singleton design pattern
Difference b/w orveriding and overloading
What is method hiding
How to create singleton class
Difference b/w sleep and wait methods
Difference b/w notify and notifyAll
String constant pool
String vs StringBuilder vs StringBuffer what to use when
Can we override static method in java ? NO
Why do we have constructor in abstract class?
Difference b/w interface and abstract class
Program to find second higheset number in Array
Difference b/w transient and volatile varialbes
What is exception in java
What are checked and unchecked exceptoins
Explain throw and throws
Explain try-catch and finally
How to create custom exception
Sample code to handle multi catch
Explain try with resource
when finally may not execute
what is the difference b/w final finally and finalize
Exception hirarchy
Can we have empty catch block
Explain Connection hierarchy
why map interface is not diretctly paer of collecions hierarchy ? They are incompatible
How HashMap Works Internally ? Based on the hashing algorithm and used hashcode and equals methods
Importance of hashcode and equals method.
Difference b/w HashMap and concurrent hashmap
How ArrayList works internally
When do we use set
When to use HashMap and TreeMap
Difference b/w Comparator and comparable ?when to use what
Comparator using lambdas
What is concurentModificationException and how to avoid it
Difference b/w fail fast and fail safe


Iterate list of objects using java8

List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
List<Integer> even = marks.stream().filter(i->i%2==0).collect(Collectors.toList());

Inbuild functional interfaces in java 8

if we remove @Functional Interface

How many ways we can create objects ? 
 
how hashset eliminates duplicates

difference b/w sleep and yield()
what is executor Service
what are wild cards in Generics
Advantages of generics ? type Safty type checking
throw and throws
What is Abstraction
Spring version used ? 4.0
spring ioc , jdbc
what is depencency injection

@component

@Bean

webServices

@Controller vs @RestController
how json is converted to java object

prevent thread execution
========================

yield()
Pauses to give chance for waiting thereads with same priority. if there is not waiting thread 
and all waiting threads have same priority then same theread will continue it's execution
it depends on the thread scheduler to get the chance for the Thread wihch is yielded.
 
join()
if a thread wants to wait for other thread to complete. if t1 wants to wait for t2 , t1 should call t2.join()
if thread calls join method on itsef progrom will enter into deadlock. thread has to wait infinite amount of time

sleep()
Thread pauses for specified amount of time.

intrupt call can be made only if  target therad is sleeping if not it will wait.

if target thread never enters sleeping/ waiting state in it's life time then there is not impact of inturuput call




Explain MicroService Architecture

synchronized  to maintain data :
disadvantage is it increasesd waiting time of thereads and creates performance problems. dont use synchronized if there is no specific requirment.

every object in java has a unique lock
when ever we use synchronized keywork then only lock concept comes into picture
if a thread wants to execute any synchronized method. first it should acquire the lock of the object once thread get's the lock then it is allowed to execure
any synchronized method on that object. once method execution completes automatically Thread releasaes the lock.
acquiring and releasing the lock is internally taken care by jvm , programmer is not responsible



Class level lock : every class in java has a unique lock which is also known as class level lock 
if a thread wantes to execute static synchronized it need class level lock once Thread gets class level lock 
then it is allowed to execute any static synchronized method of that class. once method execution completed automatically thread releases the lock

while a Tread is executing static synchronized method. the remaining Threads are not allowed to execute static synchronized methods simultanously 
but remaining Threads are allowed to execute the following methods simultaniously
normal static methods, synchronized instance methods, Normal instance methods

Synchronized Block:
The main advantage of synchronized block over synchronized method is it reduces waiting time and improves performance of the system

to get lock of current object synchronize (this){}
to get lock of particular object employ synchronized(e){}
to get lock of class Display synchronized(Display.class){}
Lock is not applicable for  primitive types/values
Race Condition? if multiple threads are operating simultaneously on same object there is a chance of data inconsistancy problem.
to avoid using synchronized keyword

A thread can acquire multiple locks from different objects


InterThread Communication:
===========================
2 Threads can communicate with each other using wait notify and notifyall methods
the theread which is expecting updation is responsible to call wait method then immediatly the thread will enter into waiting state
The Thread which is responsible to perform updation, after performing updation it is responsible to call notify method then waiting thread will get the nodification
and continue it's execution with those updated items.

wait, notify and notifyall methods are present in object class but not in thread class. because thread can class these methods on any java object

other then multithreading we dont use them anywhere else
to call wait notify and notifyall on any object Thread should be owner of the object. i.e the thread should have the lock of that object.
i.e the Thread should be inside synchronized area hence we can call wait notify and notifyall methods only from synchronized area.
else we get runtime exception saying illegal monitor state exception


if a thread call wait on any object it immediatly it released the lock of that particular object and enters into waiting state.

Cuncurrancy package
Lock interface, reentrentLock class to execute synchronized method or synchronized block
important methods of lock interface

void lock() : we can use this method to acquire a lock
if lock is already available then immediatly current thread will get that lock
if lock is not already available it will wait until it gets the lock
it is exactly same behaviour of traditional synchronized keyword.

boolean tryLock() : to acquire the lock without waiting, if the lock is available then the thread acquires the lock and returns true. if the lock is not available then
this method returns false and continue its execution without waiting. in this case thread will never enter into waiting state

boolean tryLock(1,TimeUnit.Hour) : if lock is not available it will waite until specified amount of time. if lock is not acquired within the time it continues with alrernate operation

void lockInterruptbly() acquires lock if it is available and returns immediatly. if the lock is not available then it will wait. while waiting if the thread is intrrupted then
thread won't get the lock.
void unlock(); to release the lock


reentrentLock Class : it is implementaion of lock interface and direct child class of Object. reentrant meaning a Thread can acquire same lock multiple times without any issue.
internally reenternt lock increments threads personal count when ever call lock method and decrements count value when ever thread calls unlock method.
and lock will be released when ever count reached 0.

reentrantlock rl = new reentrantlock();
reentrantlock r2 = new reentrantlock(boolean fairness);
if fairness is true then longest waiting thread can acquire the lock if it is available. i.e it follows first comes first server policy
if fairness is false then which waiting thread will get the channce we cannot expect.



Calable and Future:
in case of Runnable job Thread won't return anything after completing the job
if a Thread is required to return some result after execution then we need to go for Callable interface
Callable interface contains public Object call() throws Exeception method which returns Object
if we submit a callable object to executor then after completing the job thread returns an object of type Future.
Future object can be used to retrive the result of calllable job.



shweta.subramani@e2open.com 
