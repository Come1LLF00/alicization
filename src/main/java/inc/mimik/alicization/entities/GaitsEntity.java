package inc.mimik.alicization.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "gaits", schema = "s284733", catalog = "studs" )
public class GaitsEntity {
  private int id;
  private String name;
  private Integer fkResidentId;

  @Id
  @Column( name = "id" )
  public int getId( ) {
    return id;
  }

  public void setId( int id ) {
    this.id = id;
  }

  @Basic
  @Column( name = "name" )
  public String getName( ) {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  @Basic
  @Column( name = "fk_resident_id" )
  public Integer getFkResidentId( ) {
    return fkResidentId;
  }

  public void setFkResidentId( Integer fkResidentId ) {
    this.fkResidentId = fkResidentId;
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;
    GaitsEntity that = ( GaitsEntity ) o;
    return id == that.id && Objects.equals( name, that.name ) && Objects.equals( fkResidentId, that.fkResidentId );
  }

  @Override
  public int hashCode( ) {
    return Objects.hash( id, name, fkResidentId );
  }
}
