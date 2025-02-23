# types of model
## IAAS- 
1. provides features of virtualization. virtualization provides different virtual machines.
2. self-service and automation
3. billing- acc to resource it is charged
 ### components:-
  1. compute-virtual machines, containers
  2. storage- block storage, object storage, file storage
  3. networking- virtual networks, load balancers, vpns
  4. other services - identity and access management-controls access to resources, monitoring and analytics

## PAAS- 
1. runtime environment, runs code and develops application
### components of paas:-
 1. development tools
 2. middleware
 3. dataabse management
 4. 

 example- Google App Engine allows developers to build and deploy applications without worrying about the underlying infrastructure.

 ## SAAS-
 - access via internet
 - subscription based
 - managed infranstructure
 - multi-tenancy  

 ## CAAS
 ### how it work
 - containerization
 - Orchestration
 - resource management
 - self-service interface

 ## FAAS (Function as a service)
 1. write your own function as per your own requirement
  ### how faas works-
  - event-driven
  - stateless fn
  - automatic scaling
  - pay-as-you-go

# AWS (Amazon Web Services)

1. sudo yum install httpd :- This command installs the Apache HTTP Server package.
2. y
3. httpd -V :- this command displays the version and build parameters of the installed Apache HTTP Server.
4. sudo service httpd start :- to start
5. sudo service httpd status :- to check the status

-- NOW IF we copy the public ip address, and paste it in browser then it will show It works!

6. cd /var/www/html - default location of this file
7. vi index.html :- editing the html file, this will open the vi editor. but we'll work on nano editor

8. sudo nano index.html :- this will open the nano editor and then we can write our code

9. cat index.html :- now we can view the code in browser

now the website is published. anyone with the ip address, can view the website

---------------------------------------------------------------

1. sudo apt update

2. sudo apt git install

3. git clone (http link)

4. sudo apt install -y openjdk-17-jdk

5. (install maven to create .jar file)
sudo apt install maven :- it is building the jar file of the project, we will run the jar file not the entire project (jar- java archieve)

6. ls(see traget folder is created or not)

7. cd target/
8. ls(check jar file name)

9. java -jar (jar file name)

you can see the output of springboot application is running on 8080

copy public ip or dns name name:8080/hello or /employee

------------------------------------------------------------------------
1. lsblk (run in cloud shell)- to see memory usage of instance
2. in xvdf create one folder and mount it
mkdir /testdata (making directory testdatda)
sudo mount /dev/xvdf /testdata (for mounting)
3. for unmounting:-
sudo umount /dev/xvdf

-----------------------------------------------

### ebs snapshot (used for backup)
if we have deleted our original volume
then i'll create a new volumes 

-----------------------------------------------

### s3 buckets
to store huge amounts of data

default storage class is standard(free storage class)

when we create object- it creates a unique key, version id, value, etc.