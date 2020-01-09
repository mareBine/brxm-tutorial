package org.example.beans;
/*
 * Copyright 2014-2019 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "test1:contentdocument")
@Node(jcrType = "test1:contentdocument")
public class ContentDocument extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "test1:introduction")
    public String getIntroduction() {
        return getSingleProperty("test1:introduction");
    }

    @HippoEssentialsGenerated(internalName = "test1:title")
    public String getTitle() {
        return getSingleProperty("test1:title");
    }

    @HippoEssentialsGenerated(internalName = "test1:content")
    public HippoHtml getContent() {
        return getHippoHtml("test1:content");
    }

    @HippoEssentialsGenerated(internalName = "test1:publicationdate")
    public Calendar getPublicationDate() {
        return getSingleProperty("test1:publicationdate");
    }
}
