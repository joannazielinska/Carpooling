package carpooling;

import carpooling.Location;
import carpooling.PersonInformation;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class SingleProposition {
  public Address who;
  
  public Location startLocation;
  
  public Location destination;
  
  public PersonInformation personalData;
  
  public SingleProposition(final Address who, final Location startLocation, final Location destination, final PersonInformation personalData) {
    this.who = who;
    this.startLocation = startLocation;
    this.destination = destination;
    this.personalData = personalData;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
}
