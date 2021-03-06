/*
 Copyright (C) 2016 Electronic Arts Inc.  All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1.  Redistributions of source code must retain the above copyright
     notice, this list of conditions and the following disclaimer.
 2.  Redistributions in binary form must reproduce the above copyright
     notice, this list of conditions and the following disclaimer in the
     documentation and/or other materials provided with the distribution.
 3.  Neither the name of Electronic Arts, Inc. ("EA") nor the names of
     its contributors may be used to endorse or promote products derived
     from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY ELECTRONIC ARTS AND ITS CONTRIBUTORS "AS IS" AND ANY
 EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL ELECTRONIC ARTS OR ITS CONTRIBUTORS BE LIABLE FOR ANY
 DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package cloud.orbit.actors.extensions.hk2.test;

import cloud.orbit.annotation.Config;
import cloud.orbit.container.Container;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by joe on 3/3/2016.
 */
@Singleton
public class SingletonClass
{
    private String originalVar = "Hello";

    private String interceptVar = "Hello";

    @Config("singleton.overrideVar")
    private String configVar = "Hello";

    private boolean postConstructRan = false;

    @Inject
    private Container injectTest = null;

    @PostConstruct
    public void postConstruct()
    {
        postConstructRan = true;
    }

    public String getOriginalVar()
    {
        return originalVar;
    }

    public void setOriginalVar(String originalVar)
    {
        this.originalVar = originalVar;
    }

    public String getInterceptVar()
    {
        return interceptVar;
    }

    public void setInterceptVar(String interceptVar)
    {
        this.interceptVar = interceptVar;
    }

    public String getConfigVar()
    {
        return configVar;
    }

    public void setConfigVar(String configVar)
    {
        this.configVar = configVar;
    }

    public boolean didPostConstructRun()
    {
        return postConstructRan;
    }

    public void setPostConstructRan(boolean postConstructRan)
    {
        this.postConstructRan = postConstructRan;
    }

    public Container getInjectTest()
    {
        return injectTest;
    }
}
