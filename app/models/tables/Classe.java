/*
 * This file is generated by jOOQ.
*/
package models.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import models.Indexes;
import models.Keys;
import models.Public;
import models.tables.records.ClasseRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Classe extends TableImpl<ClasseRecord> {

    private static final long serialVersionUID = 137825800;

    /**
     * The reference instance of <code>public.Classe</code>
     */
    public static final Classe CLASSE = new Classe();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClasseRecord> getRecordType() {
        return ClasseRecord.class;
    }

    /**
     * The column <code>public.Classe.id</code>.
     */
    public final TableField<ClasseRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"Classe_id_seq\"'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.Classe.libelle</code>.
     */
    public final TableField<ClasseRecord, String> LIBELLE = createField("libelle", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.Classe</code> table reference
     */
    public Classe() {
        this(DSL.name("Classe"), null);
    }

    /**
     * Create an aliased <code>public.Classe</code> table reference
     */
    public Classe(String alias) {
        this(DSL.name(alias), CLASSE);
    }

    /**
     * Create an aliased <code>public.Classe</code> table reference
     */
    public Classe(Name alias) {
        this(alias, CLASSE);
    }

    private Classe(Name alias, Table<ClasseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Classe(Name alias, Table<ClasseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CLASSE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ClasseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLASSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClasseRecord> getPrimaryKey() {
        return Keys.CLASSE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClasseRecord>> getKeys() {
        return Arrays.<UniqueKey<ClasseRecord>>asList(Keys.CLASSE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Classe as(String alias) {
        return new Classe(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Classe as(Name alias) {
        return new Classe(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Classe rename(String name) {
        return new Classe(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Classe rename(Name name) {
        return new Classe(name, null);
    }
}
