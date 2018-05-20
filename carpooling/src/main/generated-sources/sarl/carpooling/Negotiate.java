package carpooling;

import carpooling.PersonInformation;
import carpooling.PersonRequirements;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.7")
@SarlElementType(15)
@SuppressWarnings("all")
public class Negotiate extends Event {
  public final PersonInformation personalData;
  
  public final PersonRequirements driverReq;
  
  public Negotiate(final PersonInformation personalData, final PersonRequirements personalReq) {
    this.driverReq = personalReq;
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
  
  /**
   * Returns a String representation of the Negotiate event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("personalData", this.personalData);
    builder.add("driverReq", this.driverReq);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = -3031348999L;
}
