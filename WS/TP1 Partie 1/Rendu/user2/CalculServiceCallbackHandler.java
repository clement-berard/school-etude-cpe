
/**
 * CalculServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package samples.calcul;

    /**
     *  CalculServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CalculServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CalculServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CalculServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for aditionner method
            * override this method for handling normal response from aditionner operation
            */
           public void receiveResultaditionner(
                    samples.calcul.CalculServiceStub.AditionnerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from aditionner operation
           */
            public void receiveErroraditionner(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for factorielle method
            * override this method for handling normal response from factorielle operation
            */
           public void receiveResultfactorielle(
                    samples.calcul.CalculServiceStub.FactorielleResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from factorielle operation
           */
            public void receiveErrorfactorielle(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for hasard method
            * override this method for handling normal response from hasard operation
            */
           public void receiveResulthasard(
                    samples.calcul.CalculServiceStub.HasardResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from hasard operation
           */
            public void receiveErrorhasard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for soustraire method
            * override this method for handling normal response from soustraire operation
            */
           public void receiveResultsoustraire(
                    samples.calcul.CalculServiceStub.SoustraireResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from soustraire operation
           */
            public void receiveErrorsoustraire(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for racine method
            * override this method for handling normal response from racine operation
            */
           public void receiveResultracine(
                    samples.calcul.CalculServiceStub.RacineResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from racine operation
           */
            public void receiveErrorracine(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for version method
            * override this method for handling normal response from version operation
            */
           public void receiveResultversion(
                    samples.calcul.CalculServiceStub.VersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from version operation
           */
            public void receiveErrorversion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for pi method
            * override this method for handling normal response from pi operation
            */
           public void receiveResultpi(
                    samples.calcul.CalculServiceStub.PiResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from pi operation
           */
            public void receiveErrorpi(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for multiplier method
            * override this method for handling normal response from multiplier operation
            */
           public void receiveResultmultiplier(
                    samples.calcul.CalculServiceStub.MultiplierResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from multiplier operation
           */
            public void receiveErrormultiplier(java.lang.Exception e) {
            }
                


    }
    