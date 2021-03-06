package carpooling;

import carpooling.Location;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.7")
@SarlElementType(15)
@SuppressWarnings("all")
public class Matched extends Event {
  public final Location startLocation;
  
  public final Location destination;
  
  public final ArrayList<Address> others;
  
  public Matched(final ArrayList<Address> others, final Location startLocation, final Location destination) {
    this.startLocation = startLocation;
    this.destination = destination;
    this.others = others;
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
  
  /**
   * Returns a String representation of the Matched event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("startLocation", this.startLocation);
    builder.add("destination", this.destination);
    builder.add("others", this.others);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = -1779327729L;
}
