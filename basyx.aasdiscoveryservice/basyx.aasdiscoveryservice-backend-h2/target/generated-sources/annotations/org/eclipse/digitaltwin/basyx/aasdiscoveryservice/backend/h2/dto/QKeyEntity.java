package org.eclipse.digitaltwin.basyx.aasdiscoveryservice.backend.h2.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QKeyEntity is a Querydsl query type for KeyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QKeyEntity extends EntityPathBase<KeyEntity> {

    private static final long serialVersionUID = -1751087655L;

    public static final QKeyEntity keyEntity = new QKeyEntity("keyEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes> type = createEnum("type", org.eclipse.digitaltwin.aas4j.v3.model.KeyTypes.class);

    public final StringPath value = createString("value");

    public QKeyEntity(String variable) {
        super(KeyEntity.class, forVariable(variable));
    }

    public QKeyEntity(Path<? extends KeyEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKeyEntity(PathMetadata metadata) {
        super(KeyEntity.class, metadata);
    }

}

