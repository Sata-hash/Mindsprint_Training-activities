import axios from "axios";
import { useEffect, useState } from "react";


function Users() {
    const [users, setUsers] = useState([]);

    const fetchData = async () => {
        try{
            const res = await axios.get('http://localhost:3000/users');
            setUsers(res.data)
        }
        catch(err){
            console.log(err);
        }
    }

    // this effect will execute only once when component loads
    useEffect(() => {
        fetchData();
    }, [])

    // write logic for delete user and trigger API

    const deleteUser =async (id) => {
        try{
            const resp = await axios.delete(`http://localhost:3000/users/${id}`);
            if(resp.status === 200){
                alert('User deleted successfully');
                setUsers(users.filter(user => user.id != id)); // this line will update state here, no need to retrigger
            }
        }
        catch(err){
            console.log(err);
        }
    }

    return ( 
        <div>
            <h3>
                This is Users Component
            </h3>
            <table className="table table-stripped table-bordered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Address</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        users.map(user =>(
                            <tr key ={user.id}>
                                <td>{user.id}</td>
                                <td>{user.name}</td>
                                <td>{user.email}</td>
                                <td>{user.address}</td>
                                <td>
                                    <button className="btn btn-danger" onClick={() => deleteUser(user.id)}>X</button>
                                </td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
     );
}

export default Users;