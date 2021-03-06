/*
 * This file is generated by jOOQ.
*/
package models.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import models.Indexes;
import models.Keys;
import models.Public;
import models.tables.records.EtudiantsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Etudiants extends TableImpl<EtudiantsRecord> {

    private static final long serialVersionUID = -2044103137;

    /**
     * The reference instance of <code>public.Etudiants</code>
     */
    public static final Etudiants ETUDIANTS = new Etudiants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EtudiantsRecord> getRecordType() {
        return EtudiantsRecord.class;
    }

    /**
     * The column <code>public.Etudiants.id</code>.
     */
    public final TableField<EtudiantsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"Etudiants_id_seq\"'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.Etudiants.nom</code>.
     */
    public final TableField<EtudiantsRecord, String> NOM = createField("nom", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.Etudiants.promon</code>.
     */
    public final TableField<EtudiantsRecord, String> PROMON = createField("promon", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.Etudiants.telephone</code>.
     */
    public final TableField<EtudiantsRecord, String> TELEPHONE = createField("telephone", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.Etudiants.date_naissance</code>.
     */
    public final TableField<EtudiantsRecord, Date> DATE_NAISSANCE = createField("date_naissance", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>public.Etudiants.id_classe</code>.
     */
    public final TableField<EtudiantsRecord, Integer> ID_CLASSE = createField("id_classe", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.Etudiants</code> table reference
     */
    public Etudiants() {
        this(DSL.name("Etudiants"), null);
    }

    /**
     * Create an aliased <code>public.Etudiants</code> table reference
     */
    public Etudiants(String alias) {
        this(DSL.name(alias), ETUDIANTS);
    }

    /**
     * Create an aliased <code>public.Etudiants</code> table reference
     */
    public Etudiants(Name alias) {
        this(alias, ETUDIANTS);
    }

    private Etudiants(Name alias, Table<EtudiantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Etudiants(Name alias, Table<EtudiantsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ETUDIANT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EtudiantsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ETUDIANTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EtudiantsRecord> getPrimaryKey() {
        return Keys.ETUDIANT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EtudiantsRecord>> getKeys() {
        return Arrays.<UniqueKey<EtudiantsRecord>>asList(Keys.ETUDIANT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EtudiantsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EtudiantsRecord, ?>>asList(Keys.ETUDIANTS__ETUDIANT_CLASSE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Etudiants as(String alias) {
        return new Etudiants(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Etudiants as(Name alias) {
        return new Etudiants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Etudiants rename(String name) {
        return new Etudiants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Etudiants rename(Name name) {
        return new Etudiants(name, null);
    }
}
