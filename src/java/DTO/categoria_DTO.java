
package DTO;


public class categoria_DTO {

    
    private int catId;
    private String caTipo;
    
    public categoria_DTO(int catId, String caTipo) {
        this.catId = catId;
        this.caTipo = caTipo;
    }

    

    
    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCaTipo() {
        return caTipo;
    }

    public void setCaTipo(String caTipo) {
        this.caTipo = caTipo;
    }

    }
