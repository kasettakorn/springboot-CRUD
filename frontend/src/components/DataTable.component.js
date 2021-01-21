import React, { useEffect } from 'react';
import $ from 'jquery';
import 'jquery/dist/jquery.min.js';
import 'datatables.net-dt/js/dataTables.dataTables';
import 'datatables.net-dt/css/jquery.dataTables.min.css';

function DataTable(props) {
    useEffect(() => {
        $(function () {
            $('#content').DataTable({
                buttons: [{
                    extend: 'pdfHtml5',
                    className: 'btn btn-app'
                }],
            });
        })
    }, [])

    return (
        <div>
           <table id="content" className="table table-striped table-hover">
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
                        {props.data && props.data.map((parcel, i) => {
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
                </table>
        </div>
    )
}

export default DataTable