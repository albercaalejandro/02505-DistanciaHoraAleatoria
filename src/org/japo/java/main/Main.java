/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;
import java.util.Calendar;
import java.util.Random;
/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class Main {
        
    public static final Random RND = new Random();
        public static void main(String[] args) {
             Calendar cal = Calendar.getInstance();
                int h = cal.get(Calendar.HOUR_OF_DAY);
                int m = cal.get(Calendar.MINUTE);
                int s = cal.get(Calendar.SECOND);
                int hInicio = 23;
                int mInicio = 59;
                int sInicio = 59;
                int hClase = RND.nextInt(hInicio-h)+h;
                int mClase = RND.nextInt(mInicio-m)+m;
                int sClase = RND.nextInt(sInicio-s)+s;
                int tClase1 = hClase-h;
                int tClase2 = mClase-m;
                int tClase3 = sClase-s;
                System.out.printf("Hora actual ......: %d/%d/%d%n",h,m,s);
                System.out.printf("Hora inicio ......: %d/%d/%d%n",hClase,mClase,sClase);
                System.out.printf("Tiempo de clase ..: %d/%d/%d%n",tClase1,tClase2,tClase3);
                
    }
}
