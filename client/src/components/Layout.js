import React from 'react'
import PropTypes from 'prop-types'

import { Outlet } from 'react-router-dom';

const Layout = props => {
  return (
    <main>
        <Outlet />
    </main>
  )
}

Layout.propTypes = {}

export default Layout