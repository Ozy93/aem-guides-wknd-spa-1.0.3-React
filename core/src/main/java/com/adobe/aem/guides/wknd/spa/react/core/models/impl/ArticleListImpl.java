package com.adobe.aem.guides.wknd.spa.react.core.models.impl;

import com.adobe.aem.guides.wknd.spa.react.core.models.ArticleList;
import com.adobe.aem.guides.wknd.spa.react.core.models.CustomComponent;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class, adapters = { ArticleList.class,
    ComponentExporter.class }, resourceType = ArticleListImpl.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class ArticleListImpl implements ArticleList {

    @ValueMapValue
    private String titleArticle;

    static final String RESOURCE_TYPE = "wknd-spa-react/components/article-list";

    @Override
    public String getTitleArticle() {
        System.out.println("test test");
        return StringUtils.isNotBlank(titleArticle) ? titleArticle.toUpperCase() : null;
    }

    @Override
    public String getExportedType() {
        return ArticleListImpl.RESOURCE_TYPE;
    }


} 