/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.drools.fipa.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
/**
 *
 * @author salaboy
 */
public class Activator implements
    BundleActivator {

    public void start(BundleContext bc) throws Exception {
        System.out.println( "registering fipa core  services" );
       
        
        System.out.println( "fipa core services registered" );
    }

    public void stop(BundleContext bc) throws Exception {
        System.out.println( "stoping fipa core  services" );
    }
    
}
