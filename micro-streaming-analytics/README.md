### STEPS
## APP DESIGN
<p>I plan to create a microservice that will connect to South Open Gate, and expose the data to a controller endpoint.</p>
<p>Then, I'll put the data inside a message queue, that will be delivered to a 2nd microservice.</p>
<p>That microservice will work with the data and save it in a mongodb container.</p>
<p>I'll also use mongo-express to have a better data visualization, instead of using the prompt.</p>
<p>So, in the end, I'll have 5 dockerized microservices: 2 SpringBoot microservices, rabbitmq, mongo and mongo-express. </p>

## MAVEN PROJECT
<p>I created the maven project using this command: </p>
mvn archetype:generate -DgroupId=com.rogerserra -DartifactId=my-app -DarchetypeArtifactId=micro-streaming-analytics -DarchetypeVersion=1.4 -DinteractiveMode=false
<p>Next, I edited the main pom, that will serve as a dependency manager for all my java modules (microservices).</p>

## MICROSERVICE 1: PRODUCER
<p>This module/microservice will send jsons to an exchange, that will route the message to different queues.</p>


