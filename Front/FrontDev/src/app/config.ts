export class tipo{
id:string
nome:string
descricao:string
constructor(){
    this.id = '';
    this.nome = '';
    this.descricao = '';
}

}
export class evento{
    id:string
    nome:string
    descricao:string
    tipo:tipo
    salas:Array<sala>

    constructor(){
        this.id = '';
        this.nome = '';
        this.descricao = '';
        this.tipo = new tipo;
        this.salas = new Array<sala>();
    }
    
    }
    export class sala{
        id:string
        nome:string
        descricao:string
        setores = Array<setor>();
        eventos = Array<evento>();
        constructor(){
            this.id = '';
            this.nome = '';
            this.descricao = '';
            this.setores = new Array<setor>();
            this.eventos = new Array<evento>();
        }
        
        }
        export class setor{
            id:string
            nome:string
            descricao:string
            sala : sala;
            constructor(){
                this.id = '';
                this.nome = '';
                this.descricao = '';
                this.sala = new sala;
            }
            
            }

