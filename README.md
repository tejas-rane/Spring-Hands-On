# Spring-Hands-On

Understanding basic concepts of Spring Framework configuration and etc. <br />
  1.  **Dependency Injection using** <br />
      a. constructor method  : < constructor-arg >/> tag usage <br />
      b. setter method using ref attribute<br />
  2.  initializing class properties(list) using config xml  <br />
  3.  scope="prototype" and  scope="singleton"  
  4.  **Loading a singleton Bean:** lazy loading vs pre loading : lazy-init="true"=>lazy loading <br />
      beanFactory interface always performs a lazy loading  <br />
  5.  init-method="init" <br />
      destroy-method="destroy"<br />
      default-init-method="init"<br />
      default-destroy-method="destroy" <br />  and concept of registerShutdownHook(); i.e closing application context <br />
  6.  @postConstruct @postDestroy <br />
      InitializingBean and DisposableBean <br />
  7.  **accesing propery files** using PropertyPlaceholderConfigurer
