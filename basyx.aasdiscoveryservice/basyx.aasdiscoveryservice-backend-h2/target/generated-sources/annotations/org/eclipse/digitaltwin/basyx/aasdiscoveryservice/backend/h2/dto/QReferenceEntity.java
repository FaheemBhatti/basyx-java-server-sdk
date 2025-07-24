package org.eclipse.digitaltwin.basyx.aasdiscoveryservice.backend.h2.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReferenceEntity is a Querydsl query type for ReferenceEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReferenceEntity extends EntityPathBase<ReferenceEntity> {

    private static final long serialVersionUID = -407265147L;

    public static final QReferenceEntity referenceEntity = new QReferenceEntity("referenceEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<KeyEntity, QKeyEntity> keys = this.<KeyEntity, QKeyEntity>createList("keys", KeyEntity.class, QKeyEntity.class, PathInits.DIRECT2);

    public QReferenceEntity(String variable) {
        super(ReferenceEntity.class, forVariable(variable));
    }

    public QReferenceEntity(Path<? extends ReferenceEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReferenceEntity(PathMetadata metadata) {
        super(ReferenceEntity.class, metadata);
    }

}

