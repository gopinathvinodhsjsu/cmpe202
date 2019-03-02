

package starbucks ;

/** Display Component Interface */
public interface IDisplayComponent
{
    /**
     * Return Display Component Contents
     * @return Display Component Contents
     */
    String display() ;

    /**
     * Add A Child Component
     * @param c Child Component
     */
    void addSubComponent( IDisplayComponent c ) ;
}
