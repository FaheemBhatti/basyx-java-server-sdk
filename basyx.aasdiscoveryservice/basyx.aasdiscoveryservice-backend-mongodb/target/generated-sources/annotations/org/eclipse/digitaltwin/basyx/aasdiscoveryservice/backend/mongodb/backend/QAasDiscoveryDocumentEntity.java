package org.eclipse.digitaltwin.basyx.aasdiscoveryservice.backend.mongodb.backend;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAasDiscoveryDocumentEntity is a Querydsl query type for AasDiscoveryDocumentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAasDiscoveryDocumentEntity extends EntityPathBase<AasDiscoveryDocumentEntity> {

    private static final long serialVersionUID = -1783185061L;

    public static final QAasDiscoveryDocumentEntity aasDiscoveryDocumentEntity = new QAasDiscoveryDocumentEntity("aasDiscoveryDocumentEntity");

    public final SetPath<org.eclipse.digitaltwin.basyx.aasdiscoveryservice.core.model.AssetLink, org.eclipse.digitaltwin.basyx.aasdiscoveryservice.core.model.QAssetLink> assetLinks = this.<org.eclipse.digitaltwin.basyx.aasdiscoveryservice.core.model.AssetLink, org.eclipse.digitaltwin.basyx.aasdiscoveryservice.core.model.QAssetLink>createSet("assetLinks", org.eclipse.digitaltwin.basyx.aasdiscoveryservice.core.model.AssetLink.class, org.eclipse.digitaltwin.basyx.aasdiscoveryservice.core.model.QAssetLink.class, PathInits.DIRECT2);

    public final StringPath shellIdentifier = createString("shellIdentifier");

    public final ListPath<org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId, SimplePath<org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId>> specificAssetIds = this.<org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId, SimplePath<org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId>>createList("specificAssetIds", org.eclipse.digitaltwin.aas4j.v3.model.SpecificAssetId.class, SimplePath.class, PathInits.DIRECT2);

    public QAasDiscoveryDocumentEntity(String variable) {
        super(AasDiscoveryDocumentEntity.class, forVariable(variable));
    }

    public QAasDiscoveryDocumentEntity(Path<? extends AasDiscoveryDocumentEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAasDiscoveryDocumentEntity(PathMetadata metadata) {
        super(AasDiscoveryDocumentEntity.class, metadata);
    }

}

