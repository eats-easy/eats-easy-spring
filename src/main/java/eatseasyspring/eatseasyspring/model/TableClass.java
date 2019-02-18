package eatseasyspring.eatseasyspring.model;

import javax.persistence.*;

@Entity
@Table(name = "tablesdata")
public class TableClass {
    @Id
    @SequenceGenerator(name="tablesdata_table_id_gen", sequenceName="tablesdata_table_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tablesdata_table_id_gen")

   // @Id
    @Column(name = "table_id")
    private int tableId;


    //@ManyToOne
    @JoinColumn(name = "rest_id")
    private int restId;

    @Column(name = "table_code_name")
    private String tableCodeName;

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getTableCodeName() {
        return tableCodeName;
    }

    public void setTableCodeName(String tableCodeName) {
        this.tableCodeName = tableCodeName;
    }

    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }
}

