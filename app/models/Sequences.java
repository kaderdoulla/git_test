/*
 * This file is generated by jOOQ.
*/
package models;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.Classe_id_seq</code>
     */
    public static final Sequence<Integer> CLASSE_ID_SEQ = new SequenceImpl<Integer>("Classe_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.Etudiants_id_seq</code>
     */
    public static final Sequence<Integer> ETUDIANTS_ID_SEQ = new SequenceImpl<Integer>("Etudiants_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}
