package org.eclipse.digitaltwin.basyx.aasdiscoveryservice.backend.h2.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSpecificAssetIdEntity is a Querydsl query type for SpecificAssetIdEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSpecificAssetIdEntity extends EntityPathBase<SpecificAssetIdEntity> {

    private static final long serialVersionUID = 1318339603L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSpecificAssetIdEntity specificAssetIdEntity = new QSpecificAssetIdEntity("specificAssetIdEntity");

    public final QReferenceEntity externalSubjectId;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath value = createString("value");

    public QSpecificAssetIdEntity(String variable) {
        this(SpecificAssetIdEntity.class, forVariable(variable), INITS);
    }

    public QSpecificAssetIdEntity(Path<? extends SpecificAssetIdEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSpecificAssetIdEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSpecificAssetIdEntity(PathMetadata metadata, PathInits inits) {
        this(SpecificAssetIdEntity.class, metadata, inits);
    }

    public QSpecificAssetIdEntity(Class<? extends SpecificAssetIdEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.externalSubjectId = inits.isInitialized("externalSubjectId") ? new QReferenceEntity(forProperty("externalSubjectId")) : null;
    }

}

