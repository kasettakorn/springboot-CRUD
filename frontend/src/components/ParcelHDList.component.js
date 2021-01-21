import React, { useEffect, useState } from 'react'
import DataTable from './DataTable.component';


function ParcelHDList() {
    const [parcelHD, setParcelHD] = useState(null);


    useEffect(() => {
        async function fetchData() {

            const response = await fetch("http://localhost:9092/parcelhd/all")
                .then(response => response.json())
                .then(data => {
                    return data;
                });
            setParcelHD(response);

        }
        fetchData();
    }, [])

    if (!parcelHD) {
        return <div className="text-center">
        <div className="spinner-border" role="status" style={{width:"4rem", height:"4rem"}}>
          <span className="sr-only">Loading...</span>
        </div>
      </div>
    }


    return (
        <div>
            <div className="container">
                <DataTable data={parcelHD} />
                {/* <table className="table table-striped table-dark">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>PARCEL_ID</th>
                            <th>AMPHUR_CODE</th>
                            <th>UTM_RATIO</th>
                            <th>OPERATE_NAME</th>
                        </tr>
                    </thead>
                    <tbody>
                        {parcelHD && parcelHD.map((parcel, i) => {
                            return <tr key={i}>
                                <th scope="row">
                                    {i+1}
                                </th>
                                <td>
                                    {parcel.parcel_ID}
                                </td>
                                <td>
                                    {parcel.amphur_CODE}
                                </td>
                                <td>
                                    {parcel.utm_RATIO}
                                </td>
                                <td>
                                    {parcel.operate_NAME}
                                </td>
                            </tr>
                        })}
                    </tbody>
                </table> */}
            </div>
        </div>
    )
}

export default ParcelHDList
