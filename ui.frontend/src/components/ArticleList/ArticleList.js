import React, {Component} from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';

export const CustomEditConfig = {

    emptyLabel: 'Article List',

    isEmpty: function(props) {
        return !props || !props.titleArticle || props.titleArticle.trim().length < 1;
    }
};

export default class ArticleList extends Component {

    render() {
        if(CustomEditConfig.isEmpty(this.props)) {
            return null;
        }

        return (
            <div class="ArticleList">
                <h2 class="ArticleList__message">{this.props.titleArticle}</h2>
            </div>
        );
    }
}

MapTo('wknd-spa-react/components/article-list')(ArticleList, CustomEditConfig);
