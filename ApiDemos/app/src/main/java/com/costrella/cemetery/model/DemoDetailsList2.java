/*
 * Copyright (C) 2012 The Android Open Source Project
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

package com.costrella.cemetery.model;

import com.costrella.cemetery.activity.MapActivity;
import com.google.android.gms.maps.model.LatLng;

/**
 * A list of all the demos we have available.
 */
public final class DemoDetailsList2 {

    /** This class should not be instantiated. */
    private DemoDetailsList2() {

    }
    public static Sector s_JA = new Sector("JA", new LatLng(50.074200, 19.955914));
    public static Sector s_LXXXIII = new Sector("LXXXIII", new LatLng(50.07688, 19.95734));
    public static Sector s_X = new Sector("X", new LatLng(50.07582, 19.95271));
    public static Sector s_XLVI = new Sector("XLVI", new LatLng(50.07659, 19.95307));
    public static Sector s_LXXXVII = new Sector("LXXXVII", new LatLng(50.07826, 19.95751));




    public static Person p1 = new Person("Edmund", "Kowalski", "1990-04-28", s_JA);
    public static Person p2 = new Person("Franciszek", "Kowalski", "1990-07-03", s_LXXXIII);
    public static Person p3 = new Person("Andrzej", "Nowak", "1990-09-06", s_X);
    public static Person p4 = new Person("Jan", "Nowakowski", "1991-04-11", s_XLVI);
    public static Person p5 = new Person("Eugeniusz", "Nowakowski", "1990-12-22", s_LXXXVII);

    public static final DemoDetails2[] DEMOS2 = {
            new DemoDetails2(p1.getFullName(), p1.getDeath(),
                    MapActivity.class,
                    p1),
            new DemoDetails2(p2.getFullName(), p2.getDeath(),
                    MapActivity.class,
                    p2),
            new DemoDetails2(p3.getFullName(), p3.getDeath(),
                    MapActivity.class,
                    p3),
            new DemoDetails2(p4.getFullName(), p4.getDeath(),
                    MapActivity.class,
                    p4),
            new DemoDetails2(p5.getFullName(), p5.getDeath(),
                    MapActivity.class,
                    p5),


    };
}
