/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workbench.screens.testscenario.backend.server.model;

import java.util.Date;

public class Person implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private String name;

    private int height;

    private Person coupleWith;

    private String eyeColor;

    private Date bornDate;

    private boolean isGithubContributor;

    public Person() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int height) {
        this.height = height;
    }

    public Person getCoupleWith() {
        return coupleWith;
    }

    public void setCoupleWith(Person coupleWith) {
        this.coupleWith = coupleWith;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public boolean isGithubContributor() {
        return isGithubContributor;
    }

    public void setIsGithubContributor(boolean githubContributor) {
        isGithubContributor = githubContributor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}