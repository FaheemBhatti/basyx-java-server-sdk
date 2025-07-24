package org.eclipse.digitaltwin.basyx.aasdiscoveryservice.core.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAssetLink is a Querydsl query type for AssetLink
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QAssetLink extends BeanPath<AssetLink> {

    private static final long serialVersionUID = 872686662L;

    public static final QAssetLink assetLink = new QAssetLink("assetLink");

    public final StringPath name = createString("name");

    public final StringPath value = createString("value");

    public QAssetLink(String variable) {
        super(AssetLink.class, forVariable(variable));
    }

    public QAssetLink(Path<? extends AssetLink> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAssetLink(PathMetadata metadata) {
        super(AssetLink.class, metadata);
    }

}

